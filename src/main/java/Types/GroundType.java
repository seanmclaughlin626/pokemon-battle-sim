package Types;

public class GroundType extends Type{
    public GroundType() {
        this.typeName = "Ground";
    }

    public boolean checkEffectiveness(Type targetType){
        String otherType = targetType.getTypeName();
        switch (otherType){
            case "Fire":
            case "Electric":
            case "Poison":
            case "Rock":
            case "Steel":
                this.isSuperEffective = true;
                break;
            case "Grass":
            case "Bug":
                this.isNotVeryEffective = true;
                break;
            case "Flying":
                this.noEffect = true;
                break;
        }
        return isSuperEffective;
    }
}
