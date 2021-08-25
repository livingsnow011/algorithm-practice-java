import socket

s=socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
s.connect(("localhost",2500))

for i in range(10):
    delay = 0.1
    data = "hello msg"
    while True:
        s.send(data.encode())
        print ("waiting up to {} seconds for a reply".format(delay))
        s.settimeout(delay)
        try:
            data = s.recv(1024)
        except:
            delay *=2
            if delay>2.0:
                break
        else:
            print("response : ",data.decode())
            break