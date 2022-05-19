import React from "react";

const buttonA = <button>Histórico dos Clientes</button>
const buttonB = <button>Cadastrar Cliente</button>

const hasCustumer = false

const App = () => {

  const renderShowHistory = () => (
    <div>
        Clique no botão abaixo para visualizar o histórico dos Clientes
        <br />
        {buttonA}
    </div>  
  )

  const renderAddCustumer = () => (
    <div>
        Clique abaixo para cadastrar um Cliente
        <br />
        {buttonB}
    </div>  
  )
  

  const showCustomer = () => {
    if (!hasCustumer) return null
    return(
      <div>
        <h1>Nome do Cliente: Victor Mazzo Filho</h1>
      </div>
    )
  }
  
  console.log ('hasCustumer',hasCustumer)
  
  return (
    <div>
      <p>Digital Innovation One</p>
      <p>Bem vindo a nossa aula! =D</p>
      {hasCustumer ? renderShowHistory() : renderAddCustumer()}
      <div>
        {showCustomer()}
      </div>
    </div>
  );
};
export default App;