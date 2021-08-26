from tkinter import *

root = Tk()

# 레이블 생성 포함
label1 = Label(root,text="안녕")
label1.pack()

photo = PhotoImage(file="img/1.star.png")
label2 = Label(root,image=photo)
label2.pack()

#레이블 안에서 이미지 바꿀 때, 가비지 컬렉션을 의식해서 전역변수로 생성
def change():
    label1.config(text =" 바이")
    global photo2 
    photo2 = PhotoImage(file = "img/2.star2.png")
    label2.config(image=photo2)

btn = Button(root,text="click",command=change)
btn.pack()
root.mainloop()