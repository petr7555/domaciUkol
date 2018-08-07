# Domaci úkol

Váš domácí úkol se zkládá ze dvou částí, první je zaměřená na testování, druhá na restApi a parsování JSON souborů. U obou úkol používejte vhodně git - nezapomenout commitovat, v masteru by měl být pouze zkompilovatelný kód, vhodně používat větve. U obou úkolů zvolte vhodný buildovací nástroj (Maven, Ant)

# Úkol 1
1. Udělejte si klon tohoto repozitáře
2. Použijte/Upravte interface pro Fibonacciho posloupnost
3. Implementujte následující metody
* **public void init()**                - inicializuje první dva prvky
* **public void init(int f0, int f1)**  - inicializuje první dva prvky podle f0 a f1
* **public void reset()**               - nastaví fib. posloupnost do původního stavu
* **public int getNext()**              - vrátí následující prvek fib. posloupnosti
* **public int getCurrent()**           - vrátí aktuální prvek (poslední) fib. posloupnosti
* **public int getIndexOf(int fx)**     - vrátí index (pořadí) prvku fx
* **public int getNumber(int index)**   - vrátí číslo na indexu index
4. Vhodným způsobem otestuje svoji implementaci - krátce popište do souboru testFib.txt
5. Používejte vhodné buildovací nástroje (Maven, Ant...)

# Úkol 2
>potřené url: https://my-json-server.typicode.com/pavelDohnalik/restApi/messages
1. Vytvořte si větev RestMaster, která bude představovat master pro tento úkol
2. implementujte program, který bude číst, parsovat a vypisovat na obrazovku data z výše uvedeného url
3. spuštění programu:
* **java -jar restAndJson.jar** - vypíše opsah souboru na url  
  (id=a0, from=b0, to=c0, subject=d0, text=e0;  
   id=a1, from=b1, to=c1, subject=d1, text=e1;)
* **java -jar restAndJson.jar -id xx** - vypíše pouze objekt se zadaným číslem  
  (id=xx, from=b0, to=c0, subject=d0, text=e0;)
* **java -jar restAndJson.jar from a -to b -subject c -text d** - vypíše na obrazovku json format zadaný z terminálu  
  *{  
    "id": random(),  
    "from": "a",  
    "to": "b",  
    "subject": "c",  
    "text": "d"  
  }*
  
4. soubory nahrávejte na GIT
5. využijte vhodný nástroj pro buildování
