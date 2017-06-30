class UsoTryCatch2 {
    void metodo(){
        try {
            abreConexao();
            fazConsultas(); // Não precisa mais fechar a conexao 
                            // aqui.
        } catch(SQLException e) {
            // tratamento
        } finally {
            fechaConexao(); // fechando a conexao no sucesso ou no
                            // fracasso.
        }
    }
}