import { useState } from "react";
import { useBookDataMutate } from "../../hooks/useBookDataMutate";
import { bookData } from "../../interface/bookData";
interface InputProps{
    label: string,
    value: string | number,
    updateValue(value: any): void
}

const Input = ({label, value, updateValue}: InputProps) => {
    return(
        <>
            <label>{label}</label>
            <input value={value} onChange={event => updateValue(event.target.value)}></input>
        </>
    )
}

export function CreateModal(){
    const [title, setTitle] = useState("");
    const [autor, setAutor] = useState("");
    //const [image, setImage] = useState("");
    const { mutate } = useBookDataMutate();

    const submit = () => {
        const bookData: bookData ={
            title,
            autor
            //image
        }

        mutate(bookData)
    }

    return(
        <div className="modal-overflow">
            <div className="modal-body">
                <h2>Cadastre um novo item no cardapio</h2>
                <form className="input-container">
                    <Input label="title" value={title} updateValue={setTitle}/>
                    <Input label="autor" value={autor} updateValue={setAutor}/>
                </form>
                <button onClick={submit} className="btn-secondary">Postar</button>
            </div>
        </div>
    )//Input label="image" value={image} updateValue={setImage}/> //formatação do btn-secondary aos 33:10 minutos
}