public class whileschleifen {
    int index = 1;
    while (index <= 10) {
        int quadrat = index * index;
        System.out.printnl(quadrat);
        index++;
    }

    do {
         int quadrat = index * index;
        System.out.printnl(quadrat);
        index++;
    }  while (index <= 10);
}
