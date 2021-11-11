package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamandoFuncaoKotlin {
    public static void main(){
        ArrayList<String> list = CollectionsKt.arrayListOf("Joao", "Mariaa", "Pedro");
        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
