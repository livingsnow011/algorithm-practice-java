from tkinter import *

root = Tk()
root.geometry("640x480")

# selectmode = single: 하나선택, extended : 복수 선택
# heigth = 0 : 모두 보여줌, ex) 3 : 3개만 보여줌
listbox = Listbox(root,selectmode="extended",height=0)

listbox.insert(0,"사과")
listbox.insert(1,"딸기")
listbox.insert(2,"바나나")
listbox.insert(END,"수박")
listbox.insert(END,"포도")
listbox.pack()

# 버튼을 클릭하면 맨 마지막 것이 삭제됨
def btncmd():
    listbox.delete(END)

    # 개수 확인 출력
    print("리스트에는 ",listbox.size(),"가 있어요")
    # 항목 확인
    print("1번째부터 3번째까지의 항목: ", listbox.get(0,2))
    # 선택된 항목 확인 , 인덱스 값 반환
    print("선택된 항목은 ", listbox.curselection())

btn = Button(root,text="클릭",command=btncmd)
btn.pack()

root.mainloop()