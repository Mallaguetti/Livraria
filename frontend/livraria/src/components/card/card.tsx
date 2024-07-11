import "./card.css"

interface CardProps {
    title: string,
    autor: string
    //image: String
};
export function Card({title, autor} : CardProps){
    return(
        <div className="card">
            <h2>{title}</h2>
            <p>Escrito por: {autor}</p>
        </div>
    )
};