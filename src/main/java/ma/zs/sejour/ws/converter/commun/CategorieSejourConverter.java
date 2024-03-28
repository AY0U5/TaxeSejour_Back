package ma.zs.sejour.ws.converter.commun;


import ma.zs.sejour.bean.core.commun.CategorieSejour;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;

import ma.zs.sejour.ws.dto.commun.CategorieSejourDto;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategorieSejourConverter extends AbstractConverter<CategorieSejour, CategorieSejourDto>{

    @Autowired
    private CategorieSejourConverter categorieSejourConverter ;
    private boolean categorieSejour;

    public  CategorieSejourConverter() {
        super(CategorieSejour.class, CategorieSejourDto.class);
        init(true);
    }

    @Override
    public CategorieSejour toItem(CategorieSejourDto dto) {
        CategorieSejour bean = new CategorieSejour();
        bean.setId(dto.getId());
        bean.setCode(dto.getCode());
        bean.setLibelle(dto.getLibelle());
        return bean;
    }


    @Override
    public CategorieSejourDto toDto(CategorieSejour bean) {
        CategorieSejourDto dto = new CategorieSejourDto();
        dto.setId(bean.getId());
        dto.setCode(bean.getCode());
        dto.setLibelle(bean.getLibelle());
        return dto;
    }

    public void initObject(boolean value) {
    }

}
