from tkinter import *

root = Tk()
root.geometry("640x480")

frame_burger = Frame(root,relief = "solid",bd=1)
# side
frame_burger.pack(side="left",fill="both",expand=True)

Button(frame_burger,text="햄버거").pack()
Button(frame_burger,text="치즈버거").pack()
Button(frame_burger,text="치킨버거").pack()

#LableFrame 제목이 있는 프레임
frame_drink = LabelFrame(root,text="음료")
# side top left right bottom
# fill
# expand
frame_drink.pack(side="right",fill="both",expand=True)

Button(frame_drink,text="콜라").pack()
Button(frame_drink,text="사이다").pack()
root.mainloop()