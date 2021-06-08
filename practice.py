

'''
출력문
'''
#001 
numbering(); print("hello world")
#002
print("marry's cosmetic")
#003
print("신씨가 소리질렀다. \"도둑이야.\"") # 작은 따음표 안에서 큰 따옴표 가능
#004
print("C:\Windows")
#005
print("안녕하세요.\n만나서\t\t반갑습니다.")
#006
print("오늘은","일요일")
#007
print("naver","kakao","samsung",sep=';') #print의 sep 인자 사용 ,->;
#008 
print("naver","kakao","samsung",sep='\\') 
#009
print("first",end="");print(" second") # print("원래") == print("원래",end="\n")이 숨음
#010
print(5/3)
#011
삼성전자=50000;print(10*삼성전자)
#012
시가총액=298000000000000;현재가=50000;PER=15.79
print(시가총액,type(시가총액))
print(현재가,type(현재가))
print(PER,type(PER))
#013
s="hello";t="python";print(s+'!',t)
#014
print(2+2*3)
#015
a=128
print(type(a))
#016
num_str="720";num_str=int(num_str)
print((num_str),type(num_str))
#017
num=100;num=str(num);print(num)
#018
print(type(float("15.89")))
#019
year="2020";year=int(year);print(year,year-1,year-2)
#020
price=48584;print(price*36)
'''
문자열
'''
#021
letters='python';print(letters[0],letters[2]) #파이선 인덱싱 0부터
#022 문자열 슬라이싱
license_plate="24가 2210";print(license_plate[-4:]);print(license_plate[0:2])
#023
string="홀짝홀짝홀짝";print(string[::2])#[start:end:step] step은 몇번 건너뛸지
#024
string="PYTHON";print(string[::-1])#[::-1]은 약속, 뒤집기
#025
phone_number="010-1111-2222";print(phone_number.replace('-',' '))
#026
phone_number="010-1111-2222";print(phone_number.replace('-',''))
#027
url ="http://sharebook.kr"; url=url.split('.');print(url[-1])
#028
# lang='python';lang[0]='P';print(lang) -> 에러, 문자열은 수정할 수 없다.
#029
string='abcdfe2a354a32a';string=string.replace('a','A');print(string)
#030
string='abcd';string.replace('b','B'),print(string) # 변화없음, 변경할 수 없으니까!
#031
a="3";b="4";print(a+b)
#032
print("Hi"*3)
#033
print('-'*80)
#034
t1='python';t2='java';print(4*(t1+' '+t2+' '))
#035
name1="김민수";age1=10;name2="이철희";age2=13
print("이름: %s 나이: %d"%(name1,age1))
print("이름: %s 나이: %d"%(name2,age2))
#036
string="내 나이는 {}살입니다."; print(string.format(28))
#037 f-string, string 앞에 f를 붙히면, {안의 어떤 변수든 출력 가능}
print(f"이름: {name1} 나이:{age1}")
#038
상장주식수="5,969,782,550";상장주식수=상장주식수.replace(',','')
상장주식수=int(상장주식수);print(상장주식수+1)
#039
분기="2020/03(E) (IFRS연결)"
print(분기[0:7])
#040
data="  삼성전자  "
print(data.strip())
#041
ticker = "btc_ktw";ticker=ticker.upper();print(ticker)
#042
ticker=ticker.lower();print(ticker)
#043
string="hello";string=string.capitalize();print(string)
#044
file_name="보고서.xlsx";print(file_name.endswith("xlsx"))
#045
print(file_name.endswith("xlsx") or file_name.endswith("xls"))
#print(file_name.endswith(("xlsx"),("xls"))) 도 가능
#046
print(file_name.startswith("보고"))
#047
a="hello world";a=a.split(' ');print(a)
#048
ticker=ticker.split('_');print(ticker)
#049
date="2020-05-01";date=date.split('-')
print(f"{date[0]}년 {date[1]}월 {date[2]}일")
#050 rstrip
data="039490       "; data=data.rstrip();print(data)
'''
리스트
'''
#051
movie_rank=["닥터 스트레인지","스플릿","럭키"]
#052
movie_rank.append("배트맨")
#053
movie_rank.insert(1,"슈퍼맨")
#054
del movie_rank[3]
#055
del movie_rank[2]
del movie_rank[2]
#056
lang1=["c","c++","JAVA"]
lang2=["python","Go","c#"]
langs=lang1+lang2
#057
nums=[1,2,3,4,5,6,7]
print(max(nums),min(nums))
#058
nums=[1,2,3,4,5]
print(sum(nums))
#059
cook = ["피자", "김밥", "만두", "양념치킨", 
"족발", "피자", "김치만두", "쫄면", "쏘세지", "라면", "팥빙수", "김치전"]
print(len(cook))
#060
nums=[1,2,3,4,5]
print(sum(nums)/len(nums))
#061
price = ['20180728', 100, 130, 140, 150, 160, 170]
print(price[1:])
#062
nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(nums[::2])
#063
nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(nums[1::2])
#064
nums = [1, 2, 3, 4, 5]
print(num[::-1])
#065
interest = ['삼성전자', 'LG전자', 'Naver']
print(interest[0],interest[2])
