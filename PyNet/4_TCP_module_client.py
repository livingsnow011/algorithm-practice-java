import sys
import TCP_module as mm # mymodule

port = 2500

if len(sys.argv)>1:
    port = int (eval(sys.argv[1]))
sock = mm.TCPserver(port)
c,addr = sock.Accept()
while True:
    print("connected by",addr[0],addr[1])
    data = c.recv(1024)
    if not data:
        break
    print("received message: ",data.decode())
    c.send(data)
c.close()