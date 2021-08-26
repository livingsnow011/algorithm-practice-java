from tkinter import *
import tkinter.ttk as ttk

root = Tk()
root.geometry("640x480")

#프로그레스바도 ttk
#indeterminate : 결정되지 않음, determinate : 결정된
progressbar = ttk.Progressbar(root, maximum =100,mode="determinate")
# 10 ms 마다 움직임,
progressbar.start(3)
progressbar.pack()

def btncmd():
    progressbar.stop()

btn = Button(root,text="선택",command=btncmd)
btn.pack()

root.mainloop()