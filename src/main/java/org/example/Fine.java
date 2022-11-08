package org.example;

abstract class Fine {
    public Fine() {
    }
}


class LandTaxFine extends Fine {
    int sumLandTaxFine;

    public LandTaxFine(int sumLangTaxFine) {
        this.sumLandTaxFine = sumLangTaxFine;
    }

    public int getSumLandTaxFine() {
        return this.sumLandTaxFine;
    }

    public void setSumLandTaxFine(int sumLandTaxFine) {
        this.sumLandTaxFine = sumLandTaxFine;
    }

    @Override
    public String toString() {
        return "LandTaxFine{" +
                sumLandTaxFine +
                "$}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LandTaxFine) {
            return ((LandTaxFine) obj).sumLandTaxFine == this.sumLandTaxFine;
        } else {
            return super.equals(obj);
        }
    }
}


class PropertyTaxFine extends Fine {
    int sumPropertyTaxFine;

    public PropertyTaxFine(int sumPropertyTaxFine) {
        this.sumPropertyTaxFine = sumPropertyTaxFine;
    }

    public int getSumPropertyTaxFine() {
        return this.sumPropertyTaxFine;
    }

    public void setSumPropertyTaxFine(int sumLandTaxFine) {
        this.sumPropertyTaxFine = sumLandTaxFine;
    }

    @Override
    public String toString() {
        return "PropertyTaxFine{" +
                sumPropertyTaxFine +
                "$}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PropertyTaxFine) {
            return ((PropertyTaxFine) obj).sumPropertyTaxFine == this.sumPropertyTaxFine;
        }
        return super.equals(obj);
    }
}


class ValueAddedTaxFine extends Fine {
    int sumValueAddedTax;

    public ValueAddedTaxFine(int sumValueAddedTax) {
        this.sumValueAddedTax = sumValueAddedTax;
    }

    public int getSumValueAddedTax() {
        return sumValueAddedTax;
    }

    public void setSumValueAddedTax(int sumValueAddedTax) {
        this.sumValueAddedTax = sumValueAddedTax;
    }

    @Override
    public String toString() {
        return "ValueAddedTaxFine{" +
                sumValueAddedTax +
                "$}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ValueAddedTaxFine) {
            return ((ValueAddedTaxFine) obj).sumValueAddedTax == this.sumValueAddedTax;
        }
        return super.equals(obj);
    }
}


