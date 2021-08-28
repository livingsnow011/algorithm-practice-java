from tkinter import *

root = Tk()
root.geometry("640x480")

def create_new_file():
    print("새 파일을 만듭니다.")



menu = Menu(root)
#File menu
# tearoff 하위 메뉴 분리 기능 사용 유/무 : 기본값
menu_file = Menu(menu,tearoff=0)
menu_file.add_command(label = "New File",command=create_new_file)
menu_file.add_command(label="New window")
menu_file.add_separator()
menu_file.add_command(label="Open File....")
menu_file.add_separator()
menu_file.add_command(label="Save All", state="disable") # 비활성화
menu_file.add_separator()
menu_file.add_command(label="Exit",command=root.quit)
menu.add_cascade(label="File",menu=menu_file)

#Edit menu
menu.add_cascade(label="Edit")

#Language menu, radio button
menu_lang = Menu(menu, tearoff=0)
menu_lang.add_radiobutton(label="python")
menu_lang.add_radiobutton(label="java")
menu_lang.add_radiobutton(label="c++")
menu.add_cascade(label="Langualge",menu=menu_lang)

# view menu, 체크박스
menu_view = Menu(menu,tearoff=0)
menu_view.add_checkbutton(labe="show Minimap")
menu.add_cascade(label="View", menu=menu_view)

# 메뉴는 root.config에
root.config(menu=menu)
root.mainloop()