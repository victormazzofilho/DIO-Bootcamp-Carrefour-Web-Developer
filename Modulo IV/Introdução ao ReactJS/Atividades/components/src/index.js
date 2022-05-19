import React from 'react'
import ReactDOM from 'react-dom'
import Button from './Button'
import ComponentA from './ComponentA'
import ComponentB from './ComponentB'
import "./styles.css"

function soma(a, b){
  alert (a + b)
}

function App(){

  return(
    <div className='teste'>
      Hello World
        <p>
          <Button onClick={() => soma(10,20)} name='Victor Mazzo Filho'/>
        </p>
      <ComponentA>
        <ComponentB>
          <p>
            <Button onClick={() => soma(40,20)} name='Victor Mazzo'/>
          </p>
        </ComponentB>
      </ComponentA>
    </div>
  )
}

const rootElement = document.getElementById("root")
ReactDOM.render(<App />, rootElement)

