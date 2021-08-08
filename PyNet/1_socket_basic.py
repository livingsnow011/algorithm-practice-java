import socket
# 바이너리 데이터 -> 16진수로 
from binascii import hexlify


# 1. 자신의 이름과 IP 주소 출력
def print_machine_info():
    host_name = socket.gethostname()
    print ("Host Name : %s" %host_name )
    print ("IP adress : %s" %socket.gethostbyname(host_name))

# 2. 외부 컴퓨터의 IP 주소 가져오기
def get_remote_machine_info():
    remote_host = 'www.python.org'
    try : 
        print( "IP address of %s : %s" %(remote_host,socket.gethostbyname(remote_host)))
    except socket.error:
        print ( "%s : %s"  %(remote_host,socket.gethostbyname(remote_host)) )

# 3. IPv4를 다른 데이터 포맷으로 변환
'''
inet_aton : IPv4 쿼드 문자열 주소(127.~.~.~)를 32비트 압축 바이너리 형식으로 변환
inet_ntoa : 32비트 압축 IPv4 주소를  쿼드 문자열 주소로 변환
hexlify : 32비트 주소를 ==> 16진수 8자리로 변환

IP 주소는 문자열이다. 따라서 네트워크로 데이터를 전송할 때 바이트로 패킹하고
도착했을 때 언패킹이 필요

'''
def convert_ip4_address():
    for ip_addr in ['127.0.0.1','192.168.0.1']:
        packed_ip_addr = socket.inet_aton(ip_addr)
        unpacked_ip_addr = socket.inet_ntoa(packed_ip_addr)
        print( "IP Address : %s ==> Packed : %s, Unpacked : %s" %(ip_addr,hexlify(packed_ip_addr),unpacked_ip_addr))

# 4. 주어진 포트 번호와 프로토콜 정보로 서비스 이름 찾기
def find_service_name():
    protocalname = 'tcp'
    for port in [80, 25]:
        print("Port : %s => service name : %s" %(port,socket.getservbyport(port,protocalname)))
    
    print("port : %s => service name : %s" %(53,socket.getservbyport(53,'udp')))

# 5. 호스트 컴퓨터와 네트워크 바이트 순서에 맞게 정수 변환하기
'''
네트워크 바이트와 호스트 바이트
예전에 배운 빅-엔디언, 리틀-엔디언
CPU에 따라 다르다 ( 호스트 바이트 순서가 )
따라서 네트워크에서는 통일된 방식 필요 (네트워크 바이트 순서)
'''
def convert_integer():
    data = 1234
    # 32-bit
    print( "Original : %s => Long host byte order: %s, Network byte order: %s" %(data,socket.ntohl(data),socket.htonl(data)))
    # 16-bit
    print( "Original : %s => Long host byte order: %s, Network byte order: %s" %(data,socket.ntohs(data),socket.htons(data)))

# 6. 기본 소켓 타임 아웃 값 설정,얻기
'''
소켓의 인자 도메인
PF_INET(6) : 프로토콜 체계
AF_INET(6) : 주소 체계
같은 상수 값을 가진다. 그러나 의도대로 사용하는 것을 권장

소켓의 타입
SOCK_STREAM(TCP 소켓을 할당할 때 사용되는 인자값)
1. 소켓과 소켓의 연결을 유지
2. 연결지향형 1:1 연결
3. 신뢰성 있는 수차적인 
SOCK_DGRAM(UDP 소켓을 할당할 때 사용되는 인자값)
1. 비연결지향, 비신뢰성
2. 전송 데이터 크기 제한
'''
def test_socket_timeout():
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    print ("Default socket timeout : %s" %s.gettimeout())
    s.settimeout(100)
    print ("Current socket timeout : %s" %s.gettimeout())

