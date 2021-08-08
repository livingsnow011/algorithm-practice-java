import socket

# setblocking 
# 소켓의 블로킹 모드, 논 블로킹 모드 설정
def test_socket_mode():
    s = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
    s.setblocking(1)
    s.settimeout(0.5)
    s.bind(("127.0.0.1",0))

    socket_address = s.getsockname()
    print("Trivial Server lauched on socket : %s " %str(socket_address))
    while(1):
        s.listen(1)


test_socket_mode()