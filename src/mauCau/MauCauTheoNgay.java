
private static String[] tangSoVoiBanDau = new String[]{"Chốt phiên ngày |ngay|, giá cổ phiếu |maCk| tăng từ |giaMoCua| lên thành |closeValue| .",
                                                        "Đóng cửa phiên ngày |ngay|, giá cổ phiếu |maCk| dừng lại ở mức |closeValue|,tăng |thaydoi| so với khi mở cửa phiên giao dịch.",
                                                        "Phiên giao dịch ngày |ngay| ghi nhận giá cổ phiếu |maCk| đạt |closeValue|,tăng |thaydoi| so với khi mở cửa phiên giao dịch.",
                                                        "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch ngày |ngay| đạt |closeValue|,ghi nhận tăng |thaydoi| so với thời điểm bắt đầu phiên giao dịch."};
private static String[] bangSoVoiBanDau = new String[]{"Chốt phiên ngày |ngay|, giá cổ phiếu |maCk| đứng giá tại |giaMoCua| .",
                                                        "Đóng cửa phiên ngày |ngay|, giá cổ phiếu |maCk| dừng lại ở mức |closeValue|,không đổi so với khi mở cửa phiên giao dịch.",
                                                        "Phiên giao dịch ngày |ngay| ghi nhận giá cổ phiếu |maCk| đạt |closeValue|,không đổi so với khi mở cửa phiên giao dịch.",
                                                        "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch ngày |ngay| đạt |closeValue|,ghi nhận không đổi so với thời điểm bắt đầu phiên giao dịch."};
private static String[] giamSoVoiBanDau = new String[]{"Chốt phiên ngày |ngay|, giá cổ phiếu |maCk| giảm từ |giaMoCua| xuống thành |closeValue|.",
                                                        "Đóng cửa phiên ngày |ngay|, giá cổ phiếu |maCk| dừng lại ở mức |closeValue|,giảm |thaydoi| so với khi mở cửa phiên giao dịch.",
                                                        "Phiên giao dịch ngày |ngay| ghi nhận giá cổ phiếu |maCk| đạt |closeValue|,giảm |thaydoi| so với khi mở cửa phiên giao dịch.",
                                                        "Cổ phiếu |maCk| tại lúc đóng cửa phiên giao dịch ngày |ngay| chỉ đạt |closeValue|,ghi nhận giảm |thaydoi| so với thời điểm bắt đầu phiên giao dịch."};
private static String[] giaoDichNhieu = new String[]{"Kết thúc phiên ngày |ngay|,các cổ phiếu được giao dịch nhiều nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| Trong đó,đứng đầu là mã cổ phiếu |maCk0| với khối lượng giao dịch |volume0|",
                                                    "Chốt phiên ngày |ngay| các cổ phiếu được nhà đầu tư giao dịch nhiều nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| Trong đó |maCk0| đang dẫn đầu xu thế thị trường với khối lượng giao dịch |volume0|",
                                                    "Hết phiên ngày |ngay|,các cổ phiếu đang dẫn đầu xu thế thị trường là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "};
private static String[] giaoDichIt = new String[]{"Kết thúc phiên ngày |ngay|,các cổ phiếu được giao dịch ít nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| Trong đó,thấp nhất là mã cổ phiếu |maCk0| với khối lượng giao dịch |volume0|",
                                                  "Chốt phiên ngày |ngay| các cổ phiếu được nhà đầu tư giao dịch ít nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| Trong đó |maCk0| ít được các nhà đầu tư quan tâm nhất với khối lượng giao dịch |volume0|",
                                                  "Hết phiên ngày |ngay|,các cổ phiếu ít được các nhà đầu tư quan tâm nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "};
private static String[] giaCaoDauNgay = new String[]{"Mở cửa phiên giao dịch ngày |ngay|,cổ phiếu có giá cao nhất là |maCk0| với giá |giaMoCua0|/1 cổ phiếu.",
                                                     "Mở cửa phiên giao dịch ngày |ngay| ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất ",
                                                     "Mở đầu phiên giao dịch ngày |ngay| ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất,trong đó đứng đầu là |maCk0| với giá |giaMoCua0|/1 cổ phiếu "};
private static String[] giaCaoCuoiNgay = new String[]{"Kết thúc phiên giao dịch ngày |ngay|,cổ phiếu có giá cao nhất là |maCk0| với giá |closeValue0|/1 cổ phiếu.",
                                                      "Đóng cửa phiên giao dịch ngày |ngay| ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất ",
                                                      "Chốt phiên giao dịch ngày |ngay| ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá cao nhất,trong đó đứng đầu là |maCk0| với giá |closeValue0|/1 cổ phiếu "};
private static String[] giaThapDauNgay = new String[]{"Mở cửa phiên giao dịch ngày |ngay|,cổ phiếu có giá thấp nhất là |maCk0| với giá |giaMoCua0|/1 cổ phiếu.",
                                                      "Mở cửa phiên giao dịch ngày |ngay| ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất ",
                                                      "Mở đầu phiên giao dịch ngày |ngay| ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất,trong đó nổi bật là |maCk0| với giá |giaMoCua0|/1 cổ phiếu "};
private static String[] giaThapCuoiNgay = new String[]{"Kết thúc phiên giao dịch ngày |ngay|,cổ phiếu có giá thấp nhất là |maCk0| với giá |closeValue0|/1 cổ phiếu.", "Đóng cửa phiên giao dịch ngày |ngay| ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất ", "Chốt phiên giao dịch ngày |ngay| ghi nhận các mã cổ phiếu |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| có giá thấp nhất,trong đó nổi bật là |maCk0| với giá |closeValue0|/1 cổ phiếu "};
private static String[] giaDauNgay = new String[]{"Mở cửa phiên giao dịch ngày |ngay| ghi nhận cổ phiếu |maCk| có giá |giaMoCua|/1 cổ phiếu",
                                                  "Mở đầu phiên giao dịch ngày |ngay|,1 cổ phiếu |maCk| có giá |giaMoCua|",
                                                  "Giá trị 1 cổ phiếu |maCk| là |giaMoCua| tại thời điểm bắt đầu phiên ngày |ngay|"};
private static String[] giaCuoiNgay = new String[]{"Đóng cửa phiên giao dịch ngày |ngay| ghi nhận cổ phiếu |maCk| có giá |closeValue|/1 cổ phiếu",
                                                    "Chốt phiên giao dịch ngày |ngay|,1 cổ phiếu |maCk| có giá |closeValue|",
                                                    "Giá trị 1 cổ phiếu |maCk| là |closeValue| tại thời điểm kết thúc phiên ngày |ngay|"};
private static String[] giaCaoNhat = new String[]{"Trong phiên ngày |ngay| ghi nhận từng có thời điểm giá cổ phiếu |maCk| đạt |highestValue|",
                                                  "Giá trị cao nhất của cổ phiếu |maCk| trong phiên ngày |ngay| là |highestValue|",
                                                  "Cổ phiếu |maCk| đạt giá trị cao nhất là |highestValue| trong phiên ngày |ngay|"};
private static String[] giaThapNhat = new String[]{"Trong phiên ngày |ngay| ghi nhận từng có thời điểm giá cổ phiếu |maCk| đạt |lowestValue|",
                                                   "Giá trị thấp nhất của cổ phiếu |maCk| trong phiên ngày |ngay| là |lowestValue|",
                                                   "Cổ phiếu |maCk| đạt giá trị thấp nhất là |lowestValue| trong phiên ngày |ngay|"};
private static String[] khoiLuongGiaoDich = new String[]{"Trong phiên ngày |ngay|,mã cổ phiếu |maCk| đạt khối lượng giao dịch |volume|",
                                                         "Có tổng cộng |volume| lượt giao dịch cổ phiếu |maCk| trong phiên ngày |ngay|"};
private static String[] maOnDinh = new String[]{"Các mã cổ phiếu có độ ổn định cao nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "};
private static String[] maKhongOnDinh = new String[]{"Các mã cổ phiếu có độ ổn định thấp nhất là |maCk0|,|maCk1|,|maCk2|,|maCk3|,|maCk4| "};