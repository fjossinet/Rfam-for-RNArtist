import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF00069"
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
                98 to 101
            }
            value = "#f7df03"
        }



        color {
            location {
                5 to 97
            }
            value = "#729308"
        }



    }
}           