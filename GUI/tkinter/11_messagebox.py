from tkinter import *
import tkinter.messagebox as msgbox

root = Tk()
root.geometry("640x480")

def btncmd():
    # showinfo ( title, 내용)
    msgbox.showinfo("알림","정상적으로 알림")
    msgbox.showwarning("경고","경고함")
    msgbox.showerror("에러","에러남")
    msgbox.askokcancel("확인/취소","할거야 말거야")
    msgbox.askretrycancel("재시도","재시도할거야 말거야")
    msgbox.askyesno("예/아니요", "할래?")
    response = msgbox.askyesnocancel("예/아니요/취소","ㅇㅇ")

    #response true(1)/false(0)/none(else)

btn = Button(root,text="알림",command=btncmd)
btn.pack()

root.mainloop()