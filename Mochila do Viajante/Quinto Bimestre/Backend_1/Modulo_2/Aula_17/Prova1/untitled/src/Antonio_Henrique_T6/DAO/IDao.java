package Antonio_Henrique_T6.DAO;

import java.util.List;

public interface IDao<T> {

    public T salvar(T t);
    public void eliminar(String id);
    public T buscar(String id);
    public List<T> buscarTodos();

}
