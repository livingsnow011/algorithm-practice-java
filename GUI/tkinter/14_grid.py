from tkinter import *

root = Tk()
root.geometry("640x480")

#btn1 = Button(root,text="버튼 1")
#btn2 = Button(root,text="버튼 2")
#btn1.pack(side = "left")
#btn2.pack(side = "left")
#btn1.grid(row=0,column=0)
#btn2.grid(row=1,column=1)

# 맨 윗줄
btn_f16 = Button(root,text="f16", width= 5, height =2).grid(row =0 , column = 0, sticky=N+E+W+S, padx = 3, pady = 3)
btn_f17 = Button(root,text="f17", width = 5, height =2 ).grid(row =0 , column = 1, sticky=N+E+W+S, padx = 3, pady = 3)
btn_f18 = Button(root,text="f18", width = 5, height =2 ).grid(row =0 , column = 2, sticky=N+E+W+S, padx = 3, pady = 3)
btn_f19 = Button(root,text="f19", width = 5, height =2 ).grid(row =0 , column = 3, sticky=N+E+W+S, padx = 3, pady = 3)

# clear 줄
btn_clear = Button(root,text="clear", width = 5, height =2 ).grid(row =1 , column = 0, sticky=N+E+W+S, padx = 3, pady = 3)
btn_equal = Button(root,text="=", width = 5, height =2 ).grid(row =1 , column = 1, sticky=N+E+W+S, padx = 3, pady = 3)
btn_div = Button(root,text="/", width = 5, height =2 ).grid(row =1 , column = 2, sticky=N+E+W+S, padx = 3, pady = 3)
btn_multiply = Button(root,text="*", width = 5, height =2 ).grid(row =1 , column = 3, sticky=N+E+W+S, padx = 3, pady = 3)

# 7 시작 줄
btn_7 = Button(root,text="7", width = 5, height =2 ).grid(row = 2 , column = 0, sticky=N+E+W+S, padx = 3, pady = 3)
btn_8 = Button(root,text="8", width = 5, height =2 ).grid(row = 2 , column = 1, sticky=N+E+W+S, padx = 3, pady = 3)
btn_9 = Button(root,text="9", width = 5, height =2 ).grid(row = 2 , column = 2, sticky=N+E+W+S, padx = 3, pady = 3)
btn_sub = Button(root,text="-", width = 5, height =2 ).grid(row = 2 , column = 3, sticky=N+E+W+S, padx = 3, pady = 3)

# 4 시작 줄
btn_4 = Button(root,text="4", width = 5, height =2 ).grid(row = 3 , column = 0, sticky=N+E+W+S, padx = 3, pady = 3)
btn_5 = Button(root,text="5", width = 5, height =2 ).grid(row = 3 , column = 1, sticky=N+E+W+S, padx = 3, pady = 3)
btn_6 = Button(root,text="6", width = 5, height =2 ).grid(row = 3 , column = 2, sticky=N+E+W+S, padx = 3, pady = 3)
btn_add = Button(root,text="+", width = 5, height =2 ).grid(row = 3 , column = 3, sticky=N+E+W+S, padx = 3, pady = 3)

# 1 시작 줄
btn_1 = Button(root,text="1", width = 5, height =2 ).grid(row = 4 , column = 0, sticky=N+E+W+S, padx = 3, pady = 3)
btn_2 = Button(root,text="2", width = 5, height =2 ).grid(row = 4 , column = 1, sticky=N+E+W+S, padx = 3, pady = 3)
btn_3 = Button(root,text="3", width = 5, height =2 ).grid(row = 4 , column = 2, sticky=N+E+W+S, padx = 3, pady = 3)
btn_enter = Button(root,text="enter", width = 5, height =2 ).grid(row = 4 , column = 3, rowspan = 2, sticky=N+E+W+S, padx = 3, pady = 3) # 현재위치 부터 아래쪽으로 2개 행 포함

# 0 시작 줄
btn_0 = Button(root,text="0", width = 5, height =2 ).grid(row = 5 , column = 0, columnspan = 2, sticky=N+E+W+S, padx = 3, pady = 3)
btn_point = Button(root,text=".", width = 5, height =2 ).grid(row = 5 , column = 2, sticky=N+E+W+S, padx = 3, pady = 3)

root.mainloop()