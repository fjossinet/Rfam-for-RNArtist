import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF00093"
            name = "consensus"
            use alignment numbering
        }
    }
    theme {
        details { 
            value = 3
        }

        color {
            location {
                1 to 4
                99 to 102
            }
            value = "#053cdd"
        }



        color {
            location {
                5 to 98
            }
            value = "#bd7aed"
        }



    }
}           