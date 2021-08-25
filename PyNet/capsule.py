def frame(start_ch,addr,seqNO,msg):
    #zfill string 앞에 0 채우기
    # 시작문자(1) 주소(2) 순서번호(4) 길이(4) 페이로드
    addr = str(addr).zfill(2) # 주소
    seqNO = str(seqNO).zfill(4) #순서번호
    length = str(len(msg)).zfill(4) #페이로드 길이
    return chr(start_ch)+addr+seqNO+length+msg

if __name__ == "__main__":
    start_ch = 0x05
    addr = 2
    seqNO = 1

    msg = input("your message\n")
    capsule = frame(start_ch, addr, seqNO, msg)
    print (capsule)