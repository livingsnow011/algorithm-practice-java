import socket
port = int (input ("PORT NO : "))
address = ("localhost",port)
BUFSIZE = 1024

s = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.connect(address)
while True:
    msg = input ("Message to send: ")
    s.send(msg.encode())
    data = s.recv(BUFSIZE)
    print("received message : %s" %data.decode())