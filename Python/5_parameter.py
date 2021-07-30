# 입력값이 몇 개인지 모를 때 매개변수 앞 *
def add_many(*args):
    result = 0
    for i in args:
        result = result + i
    return result

print(add_many(1,2,3))