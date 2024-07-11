//import { useState } from 'react'
import './App.css';
import { Card } from './components/card/card';
import { useBookData } from './hooks/useBookData';
import { bookData } from './interface/bookData';

function App() {
  const { data } = useBookData();
  return (
    <div className="container">
      <h1>Biblioteca</h1>
      <div className="card-grid">
        {data?.map(bookData =>
          <Card
            title={bookData.title}
            autor={bookData.autor}
            //image={bookData.image}
          />
        )}
      </div>
    </div>
  )
};

export default App;
