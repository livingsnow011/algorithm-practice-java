import tkinter

root = tkinter.Tk()
root.geometry("640x480")

# tkinter.Text 사용
txt = tkinter.Text(root,width = 30,height= 5)
txt.pack()
# 기본 글자 넣기
txt.insert(tkinter.END, "글자를 입력하세요")

# 엔트리 사용 , enter 를 입력할 수 없는, 한줄의 텍스트
# 로그인 등등
e = tkinter.Entry(root,width=30)
e.pack()

e.insert(0,"엔트리는 한줄만 입력합니다.")

def btncmd():
    #처음부터 끝까지 텍스트를 가져오기
    #라인 1 컬럼 0 부터 END 까지
    print(txt.get("1.0",tkinter.END))
    print(e.get())
    #내용 삭제
    txt.delete("1.0",tkinter.END)
    e.delete(0,tkinter.END)

btn = tkinter.Button(root,text="클릭",command=btncmd)
btn.pack()

root.mainloop()