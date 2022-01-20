import io.github.fjossinet.rnartist.core.*      

rnartist {
    ss {
        rfam {
            id = "RF00593"
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
                1 to 5
                96 to 100
            }
            value = "#eaec29"
        }



        color {
            location {
                6 to 95
            }
            value = "#de4a65"
        }



    }
}           