from tkinter import *
import os

root = Tk()
# 1. 타이틀
root.title("제목 없음 - windows 메모장")
root.resizable(True,True)
root.geometry("640x480+100+100")

# 3-1 열기 , 저장, 파일 이름
filename="mynote.txt"

def open_file():
    #파일 이면 true, 없으면 false
    if os.path.isfile(filename):
        with open (filename,"r",encoding="utf-8") as file:
            txt.delete("1.0",END) # 현재 입력창 내용 삭제
            txt.insert(END,file.read()) # 파일 내용 본문에 입력

def save_file():
    with open(filename,"w",encoding="utf-8") as file:
        file.write(txt.get("1.0",END))


# 2. 메뉴 구현
menu = Menu(root)
menu_file = Menu(menu,tearoff = 0)
menu_edit = Menu(menu,tearoff=0)
menu_form = Menu(menu,tearoff = 0)
menu_look = Menu(menu,tearoff = 0)
menu_help = Menu(menu,tearoff = 0)
menu.add_cascade(label="파일",menu=menu_file)
menu.add_cascade(label="편집",menu=menu_edit)
menu.add_cascade(label="서식",menu=menu_form)
menu.add_cascade(label="보기",menu=menu_look)
menu.add_cascade(label="도움말",menu=menu_help)

# 3. 실제 메뉴 구현
menu_file.add_command(label = "열기",command=open_file)
menu_file.add_command(label = "저장",command=save_file)
menu_file.add_command(label = "끝내기",command=root.quit)

# 5. 스크롤 바 
scroll = Scrollbar(root)
scroll.pack(side="right",fill="y")

# 4. 텍스트 창
txt =Text(root,yscrollcommand = scroll.set)
# expand(True / False:기본값 )
# fill(none: 기본값, x, y ,both)
# anchor(NW| N | NE | E ....|W| CENTER: 기본값 )
txt.pack(fill="both",expand=True)

scroll.config(command=txt.yview)
root.config(menu=menu)
root.mainloop()