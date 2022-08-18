package Antonio_Henrique_T6.Service;

import Antonio_Henrique_T6.DAO.IDao;
import Antonio_Henrique_T6.Model.Filial;

public class FilialService {
    private IDao<Filial> filiaisIDao;

    public FilialService(IDao<Filial> filiaisIDao) {
        this.filiaisIDao = filiaisIDao;
    }

    public Filial salvar(Filial filiais){
        return filiaisIDao.salvar(filiais);
    }
}
