import axios, { AxiosPromise } from "axios";
import { bookData } from "../interface/bookData";
import { useMutation, useQueryClient } from "react-query";

const API_URL = 'https://localhost:8080'; /*por aqui a URL do back End*/

const postData = async (data: bookData): AxiosPromise<any> => {
    const response = axios.post(API_URL + '/book', data);
    return response;
};

export function useBookDataMutate(){
    const queryClient = useQueryClient();
    const mutate = useMutation({
        mutationFn: postData,
        retry: 2,
        onSuccess: () => {
            queryClient.invalidateQueries(['book-data'])
        }
    })

    return mutate;
};