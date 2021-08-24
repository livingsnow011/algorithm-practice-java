class TCPserver:
    def __init__(self,port):
        import socket
        self.sock = socket.socket()
        self.sock.bind(("",port))
        self.sock.listen(5)

    def Accept(self):
        self.c_sock, self.c_addr = self.sock.accept()
        return self.c_sock,self.c_addr

if __name__ == '__main__':
    sock = TCPserver(2500)
    c , addr = sock.Accept()
    print ("수신 메시지 :" , c.recv(1024).decode())
    msg = "hello Client"
    c.send(msg.encode())
    c.close() 