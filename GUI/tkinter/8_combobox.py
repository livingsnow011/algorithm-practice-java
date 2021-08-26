from tkinter import *
import tkinter.ttk as ttk

root = Tk()
root.geometry("640x480")

values = [str(i)+"일" for i in range(1,32)]
#combo box는 tkinter.ttk에 있다.
combobox = ttk.Combobox(root,height=5,values=values,
state="readonly") # state : 상태 읽기 전용
combobox.pack()
# 최초 목록 제목 설정가능
combobox.set("카드 결제일") 
# 목록 중 첫 번째 
combobox.current(0) 


def btncmd():
    print(combobox.get())

btn = Button(root,text="선택",command=btncmd)
btn.pack()

root.mainloop()