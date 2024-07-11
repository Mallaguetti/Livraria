import axios, { AxiosPromise } from "axios";
import { bookData } from "../interface/bookData";
import { useQuery } from "react-query";

const API_URL = 'https://localhost:8080'; /*por aqui a URL do back End*/

const fetchData = async (): AxiosPromise<bookData[]> => {
    const response = axios.get(API_URL + '/book');
    return response;
};

export function useBookData(){
    const query = useQuery({
        queryFn: fetchData,
        queryKey: ['book-data'],
        retry: 2
    })

    return{
        ...query,
        data: query.data?.data // data duplicado, explicação em 16:15 do video
    }
};