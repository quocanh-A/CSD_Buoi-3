Giải thích tại sao khi a dùng 
1.for (int i = 0; i <= index; i++) {
            temp = temp.next;
        } 
thì temp nó là node tại vị trí index
còn nếu anh dùng ntn:
2.
for (int i = 0; i < index; i++) {
            temp = temp.next;
        } 
thì temp nó là node trước vị trí index


-------

1 -> 2 -> 3 -> 4 -> 5


1.
Ví dụ với index = 3:
 i <= index: i nhỏ hơn hoặc bằng index.
- Lần lặp 1 (i = 0):
temp = 1
temp = temp.next : temp = 2
- Lần lặp 2 (i = 1):
temp = 2
temp = temp.next : temp = 3
- Lần lặp 3 (i = 2):
temp = 3
temp = temp.next : temp = 4
- Lần lặp 4 (i = 3):
temp = 4
temp = temp.next : temp = 5
-> temp là node ngay tại vị trí index



2.
for (int i = 0; i < index; i++) {
            temp = temp.next;
        } 
Ví dụ với index = 3:
i < index: i nhỏ hơn index.
- Lần lặp 1 (i = 0):
temp = 1
temp = temp.next : temp = 2
- Lần lặp 2 (i = 1):
temp = 2
temp = temp.next : temp = 3
- Lần lặp 3 (i = 2):
temp = 3
temp = temp.next : temp = 4
-> temp là node trước vị trí index
