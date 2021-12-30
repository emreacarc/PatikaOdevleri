
## PROJE 1 
```
[22,27,16,2,18,6] -> Insertion Sort

 1.   Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
 2.   Big-O gösterimini yazınız.
 3.   Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
 4.    Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.

5. [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.
```

## CEVAPLAR

1.         başlangıç    [22,27,16,2,18,6]  
           index 0 için [2,27,16,22,18,6]
           index 1 için [2,6,16,22,18,27]
           index 2 için [2,6,16,22,18,27]
           index 3 için [2,6,16,18,22,27]
           index 4 için [2,6,16,18,22,27]
           index 5 için [2,6,16,18,22,27]

2.        n*(n+1)/2 = (n^2+n)/2 
          O(n^2) 

3.        1. cevabın sonunda elde ettiğimiz diziye göre;
          Best case: 2
          Worst case: 27
          Average case: 16 ve 18 olabilir

4.        18 average case kapsamına girer.

5.        başlangıç      [7,3,5,8,2,9,4,15,6]
          1. adım        [2,3,5,8,7,9,4,15,6]
          2. adım        [2,3,5,8,7,9,4,15,6]
          3. adım        [2,3,4,8,7,9,5,15,6]
          4. adım        [2,3,4,5,7,9,8,15,6]









