package  ma.zs.sejour.ws.converter.taux;

import ma.zs.sejour.bean.core.Taxe.TaxeSejourTrim;
import ma.zs.sejour.ws.converter.commun.EmployeConverter;
import ma.zs.sejour.ws.dto.Taxe.TaxeSejourTrimDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




import ma.zs.sejour.zynerator.util.StringUtil;
import ma.zs.sejour.zynerator.converter.AbstractConverter;
import ma.zs.sejour.zynerator.util.DateUtil;
import ma.zs.sejour.bean.core.taux.TauxTaxeSejourAnnuel;
import ma.zs.sejour.ws.dto.taux.TauxTaxeSejourAnnuelDto;

@Component
public class TauxTaxeSejourAnnuelConverter extends AbstractConverter<TauxTaxeSejourAnnuel, TauxTaxeSejourAnnuelDto> {

    @Autowired
    private EmployeConverter employeConverter;

    private boolean employe;

    public  TauxTaxeSejourAnnuelConverter() {
        super(TauxTaxeSejourAnnuel.class, TauxTaxeSejourAnnuelDto.class);
    }

    @Override
    public TauxTaxeSejourAnnuel toItem(TauxTaxeSejourAnnuelDto dto) {
        if (dto == null) {
            return null;
        } else {
        TauxTaxeSejourAnnuel item = new TauxTaxeSejourAnnuel();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCategorieSejourCode()))
                item.setCategorieSejourCode(dto.getCategorieSejourCode());
            if(StringUtil.isNotEmpty(dto.getMontantNuit()))
                item.setMontantNuit(dto.getMontantNuit());
            if(StringUtil.isNotEmpty(dto.getPourcentagePremierMoisRetard()))
                item.setPourcentagePremierMoisRetard(dto.getPourcentagePremierMoisRetard());
            if(StringUtil.isNotEmpty(dto.getPourcentageAutreMoisRetard()))
                item.setPourcentageAutreMoisRetard(dto.getPourcentageAutreMoisRetard());
            if(this.employe && dto.getEmploye() != null && dto.getEmploye().getId() != null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye()));
        return item;
        }
    }

    @Override
    public TauxTaxeSejourAnnuelDto toDto(TauxTaxeSejourAnnuel item) {
        if (item == null) {
            return null;
        } else {
            TauxTaxeSejourAnnuelDto dto = new TauxTaxeSejourAnnuelDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCategorieSejourCode()))
                dto.setCategorieSejourCode(item.getCategorieSejourCode());
            if(StringUtil.isNotEmpty(item.getMontantNuit()))
                dto.setMontantNuit(item.getMontantNuit());
            if(StringUtil.isNotEmpty(item.getPourcentagePremierMoisRetard()))
                dto.setPourcentagePremierMoisRetard(item.getPourcentagePremierMoisRetard());
            if(StringUtil.isNotEmpty(item.getPourcentageAutreMoisRetard()))
                dto.setPourcentageAutreMoisRetard(item.getPourcentageAutreMoisRetard());
            if(this.employe && item.getEmploye() != null)
                dto.setEmploye(employeConverter.toDto(item.getEmploye()));
        return dto;
        }
    }




    public void initObject(boolean value) {
        this.employe = value;
    }

    public void copy(TauxTaxeSejourAnnuelDto dto, TauxTaxeSejourAnnuel t) {
        super.copy(dto, t);
        if (dto.getEmploye() != null)
            employeConverter.copy(dto.getEmploye(), t.getEmploye());
    }


    public EmployeConverter getEmployeConverter() {
        return employeConverter;
    }

    public void setEmployeConverter(EmployeConverter employeConverter) {
        this.employeConverter = employeConverter;
    }

    public boolean isEmploye() {
        return employe;
    }

    public void setEmploye(boolean employe) {
        this.employe = employe;
    }
}
