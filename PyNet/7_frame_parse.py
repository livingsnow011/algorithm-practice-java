import socket
import capsule

SIZE = 5 # 페이로드
sock = socket.socket()
sock.connect(("localhost",2500))

head = 0x05
addr = 1
seq = 1
frame_seq = ""
msg = "hello world"
print("전송 메세지: ",msg)
for i in range(0,len(msg),SIZE):
    frame_seq += capsule.frame(head, addr, seq, msg[i:i+SIZE])
    seq +=1
sock.send(frame_seq.encode())
msg = sock.recv(1024).decode()
print ("수신 프레임: ", msg)
r_frame = msg.split(chr(0x05))
del r_frame[0]
p_msg = ""
for field in r_frame:
    p_msg += field[10:(11+int(field[6:10]))]
print("복원 메세지: ", p_msg)
sock.close()