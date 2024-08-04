import './App.css';
import { useState } from 'react'
import { Card } from './components/card/card';
import { useBookData } from './hooks/useBookData';
import { bookData } from './interface/bookData';
import { CreateModal } from './components/create-modal/create-modal';

function App() {
  const { data } = useBookData();
  const [isModalOpen, setIsModalOpen] = useState(false)

  const handleOpenModal = () => {
    setIsModalOpen(prev => !prev)
  }

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
      {isModalOpen && <CreateModal closeModal={handleOpenModal}/>}
      <button onClick={handleOpenModal}>novo</button>
    </div>
  )
};

export default App;
