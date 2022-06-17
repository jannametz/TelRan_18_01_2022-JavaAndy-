
/*I.Quick sort
1.Выбираем опорный элемент из массива. Как правило, это средний элемент pivot.
2.Делим массив на 2 подмассива. Элементы, которые меньше опорного, и элементы, которые больше опорного.
3.Рекурсивно применяем сортировку к обоим подмассивам.
В результате массивы будут делиться до тех пор, пока не останется один элемент, который потом отсортируется.

II. Провести асимптотический анализ – сложность алгоритма = O(?)
*/
public class QuickSort {
   static int partition(int []array, int begin, int end) {  // method to find the partition position
       int pivot = array[end]; // choose the rightmost element as pivot
       int i = (begin - 1);  // pointer for greater element
       for (int j = begin; j < end; j++) {   // traverse through all elements, compare each element with pivot
           if (array[j] <= pivot) {
               i++;// if element smaller than pivot is found, swap it with the great element pointed by i
               int temp = array[i];  // swapping element at i with element at j
               array[i] = array[j];
               array[j] = temp;
           }
       }
       // swap the pivot element with the greater element specified by i
       int temp = array[i + 1];
       array[i + 1] = array[end];
       array[end] = temp;
       return (i + 1);   // return the position from where partition is done
   }
    static void quickSort(int []array, int begin, int end) {
        if (begin < end) {
            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, begin, end);
            quickSort(array, begin, pi - 1); // recursive call on the left of pivot
            quickSort(array, pi + 1, end);// recursive call on the right of pivot
        }
    }
}
/* The quick sort is a divide and conquer algorithm.
Quicksort Complexity
Time Complexity
Best	       O(n*log n)
Worst	       O(n2)
Average	       O(n*log n)
Space Complexity	       O(log n)
Der Ansatz des Divide-and-Conquer lässt sich auf Probleme anwenden, die sich auf die folgende Weise lösen lassen:
1.	Das Problem in Teilprobleme aufteilen. (divide)
2.	Die einzelnen Teilprobleme (in der Regel rekursiv) unabhängig voneinander
lösen.
3.	Die erhaltenen Lösungen der Teilprobleme zu einer Gesamtlösung zusammen-
setzen. (conquer)
 */
// weitere Beschreibung und Beweis(proof) folgt