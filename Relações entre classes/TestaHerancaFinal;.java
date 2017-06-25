final class Pai{
}

class Filho extends Pai{
    //nao compila, pai é final
}

class Mae{
}

final class Filha extends Mae{
    //uma classe final pode estender de alguem , compila
}