from tkinter import *

root = Tk()
root.geometry("640x480")

def btncmd():
    pass

btn = Button(root,text="선택",command=btncmd)
btn.pack()

root.mainloop()