from tkinter import *
import tkinter.ttk as ttk
import time
root = Tk()
root.geometry("640x480")
'''
#프로그레스바도 ttk
#indeterminate : 결정되지 않음, determinate : 결정된
progressbar = ttk.Progressbar(root, maximum =100,mode="determinate")
# 10 ms 마다 움직임,
progressbar.start(3)
progressbar.pack()
'''
p_var2 = DoubleVar()
progressbar2 = ttk.Progressbar(root,maximum = 100, length = 150,
variable=p_var2)
progressbar2.pack()

def btncmd():
    #progressbar.stop()
    for i in range (1,101) :
        time.sleep(0.1) # 0.01초 대기

        p_var2.set(i) #progress bar의 값 설정
        progressbar2.update() # gui 업데이트
        print(p_var2.get())
        
btn = Button(root,text="선택",command=btncmd)
btn.pack()

root.mainloop()