from tkinter import *

# 창 생성
root = Tk()
root.geometry("640x480+100+100")
# 버튼 생성
btn1 = Button(root,text="버튼1")
# 버튼 넣기
btn1.pack()
# 버튼 여백 공간 설정
btn2 = Button(root,padx=5,pady=10, text ="버튼2")
btn2.pack()
# 버튼 고정 크기 설정 
btn3 = Button(root,width=40,height=10,text="버튼3")
btn3.pack()
# 버튼 색깔 ,fg= 폰트 , bg = 배경
btn4 = Button(root,fg ="red", bg="yellow",text="버튼4")
btn4.pack()
# 그림이미지 불러오기
photo = PhotoImage(file="img/1.star.png")
btn5= Button(root,image=photo)
btn5.pack()
# 버튼 동작
def btncmd():
    print("버튼이 클릭되었습니다.")

btn7 = Button(root,text="동작하는 버튼",command=btncmd)
btn7.pack()
root.mainloop()