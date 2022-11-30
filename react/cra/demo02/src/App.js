import {useState} from 'react'; 
import './App.css';

const App = props=>{
  const [color, setColor] = useState('black');

  return (
    <div>
      <h1 style={ {color : color} }>리액트 프로젝트 데모</h1>
      <hr/>
      <button onClick={()=>setColor('black')}>Black</button>
      <button onClick={()=>setColor('red')}>Red</button>
      <button onClick={()=>setColor('blue')}>Blue</button>
    </div>
  );
}

export default App;