from tkinter import *

root = Tk()
root.geometry("640x480")

frame = Frame(root)
frame.pack()

scroll = Scrollbar(frame)
scroll.pack(side="right",fill="y")

listbox = Listbox(frame,selectmode="extended", height= 10
,yscrollcommand = scroll.set)
for i in range(1,32):
    listbox.insert(END,str(i)+"일")
listbox.pack(side="left")

scroll.config(command=listbox.yview)
root.mainloop()