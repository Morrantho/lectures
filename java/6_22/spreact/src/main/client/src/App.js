import logo from './logo.svg';
import './App.css';

import axios from "axios";

import {useEffect} from "react";

function App()
{
	console.log("APP COMPONENT CREATED");
	
	let [recipes,setRecipes]=useState([]);
	
	useEffect(()=>
	{
		console.log("App Component Init");

		axios.get("http://localhost:8080/api/recipe")
		.then(res=>
		{
			console.log("After Query");
			console.log(res.data);
			
			setRecipes(res.data);
		})
		.catch(e=>console.log(e));	

	},[]);
	
  return (
    <div className="App">
    	<p>Hello Spring From React</p>
    </div>
  );
}

export default App;
