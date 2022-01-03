## PROJE 2: MERGE SORT

[16,21,11,8,12,22] -> Merge Sort

1.    Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
2.    Big-O gösterimini yazınız.

## CEVAPLAR

1.        [16,21,11,8,12,22]
          [16,21,11][8,12,22]
          [16,21][11][8,12][22]
          [16][21][11][8][12][22]
          [16,21][8,11][12,22]
          [8,11,16,21][12,22]
          [8,11,12,16,21,22]

2.        (n-1) * (n-1) * (n-1) * ... 
          log(2)n tane var.
          O(n*logn)
 
