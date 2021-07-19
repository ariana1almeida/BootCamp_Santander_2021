# Trabalhando com datas

O java.util.Date está no JDK desde sua versão 1.0, ou seja, é de se esperar que algumas coisas não se mostrem tão interessantes nos dias atuais, dado a sua idade.

Construtores da classe Date:

```java
Date()
Date(int year, int month, int date)//deprecated
Date(int year, int month, int date, int hrs, int min)//deprecated
Date(int yea, int month, int date, int hrs, int min, int sec) //deprecated
Date(long date)
    
Date(String s)//deprecated
```

Date() :

Esse construtor vai alocar um objeto da classe Date e o inicializará com o milissegundo mais próximo do período da sua execução.

```java
import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args) {
        Date novaData = new Date();
        System.out.println(novaData);
        //retorna: Thu Jul 08 09:55:08 BRT 2019 (a data atual no caso)
    }
}
```

Date(long date)

Diferente do construtor anterior, esse construtor espera que você passe os milissegundos com base padrão de tempo (epoch) que usa como referência 1 de janeiro de 1970 00:00:00;

O que é Epoch?

"O epoch timestamp é um padrão largamente aceito para representar uma data como um inteiro 32-bits a partir do início do Unix Epoch..."

```java
import java.utilDate;

public class Exemplo002 {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis); //1563127311564
        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData); //Sun Jul 14 15:01:51 BRT 2019
    }
}
```

Métodos úteis:

Alguns métodos da classe Date são muito úteis e serão usados com frequência durante a manipulação de datas.

São eles...

![image-20210716162952654](C:\Users\arian\AppData\Roaming\Typora\typora-user-images\image-20210716162952654.png)



After e before:

```java
import java.util.Date;

public class Exemplo003 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date (1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017
        
        Date dataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 08:13:27 BRST 2021
        
        //Comparando se a dataNoPassado é posterior a dataNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);
        
        System.out.println(isAfter);
        //false
        
        //Comparando se a dataNoPassado é anterior a dataNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);
        //true
    }
}
```

compareTo e equals:

```java
import java.utilDate;

public class Exemplo004 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date (1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017
        
        Date dataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 08:13:27 BRST 2021
        
        Date mesmaDataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021
        
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        
        System.out.println(isEquals); //true
        
        /* comparando uma data com a outra*/
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes
        System.out.println(compareCase1); // -1
        System.out.println(compareCase2); //1
        System.out.println(compareCase3); //0
    }
}
```

from e toInstant:



**Classe Instant** surgiu na JDK 1.8, é imutável e Thread safe, modela um ponto instantâneo de uma linha do tempo e é indicado para gravar marcações temporais em eventos da sua aplicação.



```java
import java.time.Instant;
import java.utilDate;

/*Exemplo de conversão entre Date e Instant*/
public class Exemplo005 {
    public static void main(String[] args) {
        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        //Tue Dec 12 22:26:47 BRST 2017
        
        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        //2017-12-13T00:26:47.691Z
    }
}
```

Exercício Final: 

-descubra o timeInMillis do dia que você nasceu;

Converta em um objeto Date;

Verifique se ele é anterior ou posterior a 15 de maio de 2010;





#### java.util.Calendar

Já na JDK 1.1 foi observada a necessidade de facilitar alguns recursos que a class Date oferecia. Sendo assim, a classe Calendar foi criada. Com isso uma érie de métodos e construtores da classe Date foi depreciada. Por exemplo o construtor Date (int year, int month, int date).

Calendar é uma classe abstrata que provê métodos para converter data entre um instante específico. O calendar possui alguns campos específicos para manipulação como 	MONTH, YEAR, HOUR etc.



capturando o instante atual com Calendar:

```java
import java.util.Calendar;

public class Exemplo005 {
    public static void main (String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println(agora);
    }
}
```



Manipulando datas

```java
import java.util.Calendar;

public class Exemplo006 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        
        System.out.println("A data corrente é: " + agora.getTime());
        //A data corrente é: Sun Jul 14 20:50:31 BRT 2019
        
        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        //15 dias atrás: Sat Jun 29 20:50:31 BRT 2019
        agora.add(Calendar.Month, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        //4 meses depois: Tue Oct 29 20:50:31 BRT 2019
        
        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        //2 anos depois: Fri Oct 29 20:50:31 BRT 2021
    }
}
```



imprimindo datas e horas:

```java
import java.util.Calendar;

public class Exemplo007 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        
        System.out.printf("%tc\n", agora);
        //Dom jul 14 20:58:11 BRT 2019
        
        System.out.printf("%tF\n", agora);
        //2019-07-14
        
        System.out.printf("%tD\n", agora);
        //07/14/19
        
        System.out.printf("%tr\n", agora);
        //08:58:11 PM
        
        System.out.printf("%tT\n", agora);
        //20:58:11
    }
}
```

Exercício final: um cliente tem 10 dias para pagar uma fatura após sua data de vencimento sem que os juros sejam cobrados. Caso essa data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte. Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.





java.text.DateFormat

nesse ponto em que estamos existem, basicamente, duas classes para formatação de datas. O DateFormat e o SimpleDateFormat. Ambos oferecem maneiras de formatar e parsear a saída das datas.



DateFormat

```java
import java.text.DateFormat;
import java.util.Date;

/*Exemplo de formatação de data com DateFormat*/

public class Exemplo008 {
    public static void main(String[] args) {
        
        Date agora = new Date();
        
        String dateToStr = DateFormat. getInstance().format(agora);
    
    System.out.println(dateToStr);
    // 14/07/19 22:40
    
    dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
    
    System.out.println(dateToStr);
    //14 de Julho de 2019 22:40
    
    }
}
```

SimpleDateFormat

Já o SimpleDateFormat traz uma grande facilidade que é definir um padrão de formatação para a saída de data que você deseja.

```java
import java.text.SimpleDateFormat;
import java.util.Date;

/*Exemplo de formatação de data  com SimpleDateFormat*/
public class Exemplo009 {
    public static void main(String [] args) {
        
        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd//MM/yyyyy");
        String dataFormatada = formatter.format(agora);
        
        System.out.println(dataFormatada);
        //14/07/2019
    }
}
```

Exercício final: Converta a Data atual no formato DD/MM/YYYY HH:MM:SS:MMM





#### Datas no Java 8+

O Java 8 veio com uma série de novidades para facilitar o trabalho com Datas. E a grande melhoria está no pacote java.time que foi herdado do projeto Joda Time.

Trabalhar com datas nunca foi tão fácil com esse novo pacote. Nele destacam-se três classes:

-LocalDate;

-LocalTime;

-LocalDateTime.





LocalDate:

é uma classe imutável para representar uma data. Seu formato padrão é yyyy-MM-dd

```java
import java.time.LocalDate;


/*Exemplo de como utilizar LocalDate*/

public class Exemplo010 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        //2019-07-14
    }
}
```

```java
import java.time.LocalDate;


/*Exemplo de como utilizar LocalDate*/

public class Exemplo010 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        
        System.out.println(hoje);
        //2019-07-14
        System.out.println(ontem);
        //2019-07-13
    }
}
```



LocalTime:

é uma classe imutável que representa um padrão de hora-minuto-segundo.

LocalTime pode ser representado até o nível de nanosegundos. Exemplo: 12:22:10:123212345.

Sua utilização é similar ao LocalDate

```java
import java.time.LocalTime;

/*Exemplo de como utilizar LocalTime*/

public class Exemplo012 {
    public static ovid main(String[] args) {
    	LocalTime agora = LocalTime.now();
  		System.out.println(agora)
         //23:53:58.421
    }
}
```



```java
import java.time.LocalTime;

/*Exemplo de como manipular LocalTime*/

public class Exemplo012 {
    public static ovid main(String[] args) {
    	LocalTime agora = LocalTime.now();
        System.out.println(agora);
        
        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);
        //00:55:37.421
   }
}
```





LocalDateTime:

funciona como uma espécie de junção entre o LocalTime e o LocalDate.

Também é uma classe imutável e você consegue trabalhar com dia e hora de uma só vez.

Você pode manipular a data e hora com precisão de nanosegundos. Exemplo: 2nd October 2007 at 13:45:30.123456789.

```java
import java.time.LocalDateTime:

/*Exemplo de como manipular LocalDateTime*/
public class Exemplo014 {
    public static void main(String[] args){
        
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2019-07-15T00:02:16.076

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        //2019-07-17T01:02:28.076

    }
}
```

Exercício final: Adiciona 4 anos, 6 meses e 13 horas ao momento 15/05/2010 10:00:00

