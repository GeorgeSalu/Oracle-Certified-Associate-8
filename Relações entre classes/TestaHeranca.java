class Mae {

}
class Filha extends Mae {

}
class Neta extends Filha{

}

//toda classe que nao define de quem esta herdando herda de Object
class Explicito extends Object {

}
class Implicito {
    //extends object por padrao
}
class FilhoDeImplicito extends Implicito{
    //tambem herda de object, indiretamente
}