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


    public  CategorieSejourConverter() {
        super(CategorieSejour.class, CategorieSejourDto.class);
        init(true);
    }

    @Override
    public CategorieSejour toItem(CategorieSejourDto dto) {
        if (dto == null) {
            return null;
        }else {
            CategorieSejour item = new CategorieSejour();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            return item;
        }
    }


    @Override
    public CategorieSejourDto toDto(CategorieSejour bean) {
        if (bean == null) {
            return null;
        }else {
            CategorieSejourDto dto = new CategorieSejourDto();
            if (StringUtil.isNotEmpty(bean.getId()))
                dto.setId(bean.getId());
            if (StringUtil.isNotEmpty(bean.getCode()))
                dto.setCode(bean.getCode());
            if (StringUtil.isNotEmpty(bean.getLibelle()))
                dto.setLibelle(bean.getLibelle());
            return dto;
        }
    }
}
